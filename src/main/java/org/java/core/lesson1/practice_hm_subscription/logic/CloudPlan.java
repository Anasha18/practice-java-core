package org.java.core.lesson1.practice_hm_subscription.logic;

import org.java.core.lesson1.practice_hm_subscription.interfaces.Billable;
import org.java.core.lesson1.practice_hm_subscription.model.Subscription;

public class CloudPlan extends Subscription implements Billable {
    private int storageTb = 1;
    private int baseTbPrice = 150;
    private int extraTbPrice;

    public CloudPlan(
            String id,
            String title,
            double monthlyPrice,
            int startDate,
            boolean active,
            int extraTbPrice
    ) {
        super(
                id,
                title,
                monthlyPrice,
                startDate,
                active
        );
        this.extraTbPrice = extraTbPrice;
    }

    @Override
    public double monthlyCharge(int forMonth) {

        if (!active) return 0;

        int countTb = storageTb;

        if (storageTb > 1) return monthlyPrice + countTb * extraTbPrice;

        return monthlyPrice;
    }
}
