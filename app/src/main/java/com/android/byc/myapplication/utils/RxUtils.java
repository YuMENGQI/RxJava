package com.android.byc.myapplication.utils;

import rx.subscriptions.CompositeSubscription;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/31 17:04
 * @description
 */
public class RxUtils {

    private RxUtils() {

    }

    public static CompositeSubscription getNewCompositeSubIfUnsubscribed(CompositeSubscription subscription) {
        if (subscription == null || subscription.isUnsubscribed()) {
            return new CompositeSubscription();
        }
        return subscription;
    }

    public static void unsubscribeIfNotNull(CompositeSubscription subscription) {
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

}
