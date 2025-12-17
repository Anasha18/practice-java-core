package org.java.core.lesson1.practice_hm_subscription.logic;

import org.java.core.lesson1.practice_hm_subscription.interfaces.Billable;
import org.java.core.lesson1.practice_hm_subscription.interfaces.TrialSupport;
import org.java.core.lesson1.practice_hm_subscription.model.Subscription;

public class MusicPlan extends Subscription implements Billable, TrialSupport {
    private int trialDays = 14;

    public MusicPlan(
            String id,
            String title,
            double monthlyPrice,
            int startDate,
            boolean active,
            int trialDays
    ) {
        super(
                id,
                title,
                monthlyPrice,
                startDate,
                active
        );
        this.trialDays = trialDays;
    }

    @Override
    public double monthlyCharge(int forMonth) {
        if (!active) {
            return 0;
        }

        if (isInTrial(forMonth)) {
            return 0;
        }

        return monthlyPrice;
    }

    @Override
    public int trialDays() {
        return this.trialDays;
    }

    @Override
    public boolean isInTrial(int date) {
        return date <= trialDays && trialDays > 0;
    }
}
