package org.java.core.lesson5.multithreading.account;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(
            Account accountFrom,
            Account accountTo
    ) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            lockAccounts();
            try{
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            }finally {
                accountFrom.getLock().unlock();
                accountTo.getLock().unlock();
            }
        }

    }

    private void lockAccounts() {
        while (true) {
            boolean fromLockRes = accountFrom.getLock().tryLock();
            boolean toLockRes = accountTo.getLock().tryLock();

            if (fromLockRes && toLockRes) {
                break;
            }

            if (fromLockRes) {
                accountFrom.getLock().unlock();
            }

            if (toLockRes) {
                accountTo.getLock().unlock();
            }
        }
    }
}
