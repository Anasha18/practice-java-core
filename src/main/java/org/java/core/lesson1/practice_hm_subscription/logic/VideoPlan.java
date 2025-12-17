package org.java.core.lesson1.practice_hm_subscription.logic;

import org.java.core.lesson1.practice_hm_subscription.interfaces.Billable;
import org.java.core.lesson1.practice_hm_subscription.interfaces.Pausable;
import org.java.core.lesson1.practice_hm_subscription.interfaces.Sharable;
import org.java.core.lesson1.practice_hm_subscription.model.Subscription;

public class VideoPlan extends Subscription implements Billable, Pausable, Sharable {
    private final int maxProfiles = 4;
    private String[] members;
    private boolean isPaused = false;
    private int pauseStart = 0;
    private int pauseEnd = 0;

    public VideoPlan(
            String id,
            String title,
            double monthlyPrice,
            int startDate,
            boolean active,
            String[] members,
            boolean isPaused,
            int pauseStart,
            int pauseEnd) {
        super(
                id,
                title,
                monthlyPrice,
                startDate,
                active
        );
        this.members = members;
        this.isPaused = isPaused;
        this.pauseStart = pauseStart;
        this.pauseEnd = pauseEnd;
    }

    @Override
    public double monthlyCharge(int forMonth) {
        if (!active) {
            return 0;
        }

        if (isPausedOn(forMonth)) {
            return 0;
        }

        return monthlyPrice;
    }


    @Override
    public void pause(int from, int to) {
        this.pauseStart = from;
        this.pauseEnd = to;
        this.isPaused = true;
    }

    @Override
    public boolean isPausedOn(int date) {
        return isPaused && date >= pauseStart && date <= pauseEnd;
    }

    @Override
    public int maxProfiles() {
        return this.maxProfiles;
    }

    @Override
    public void addMember(String userId) {
        if (members.length >= maxProfiles) {
            return;
        }

        String[] newMembers = new String[members.length + 1];

        for (int i = 0; i < newMembers.length; i++) {
            newMembers[i] = members[i];
        }

        newMembers[newMembers.length - 1] = userId;
        members = newMembers;

    }

    @Override
    public void removeMember(String userId) {
        String[] membersCopy = new String[members.length];

        for (int i = 0; i < membersCopy.length; i++) {
            if (members[i].equals(userId)) {
                continue;
            }
            membersCopy[i] = members[i];
        }

        members = membersCopy;
    }
}
