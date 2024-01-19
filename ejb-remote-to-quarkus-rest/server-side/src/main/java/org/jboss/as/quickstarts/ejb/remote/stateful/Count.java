package org.jboss.as.quickstarts.ejb.remote.stateful;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Count {

    private int count = 0;

    public void increment() {
        this.count++;
    }

    public void decrement() {
        this.count--;
    }

    public int getCount() {
        return this.count;
    }
}
