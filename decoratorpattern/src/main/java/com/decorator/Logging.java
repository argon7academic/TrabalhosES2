package com.decorator;

import java.io.IOException;

public class Logging extends Decorator {

    public Logging(AuthInterface auth) {
        super(auth);
    }

    @Override
    public void auth(String username, String password) throws AuthException, IOException {
        auth.auth(username, password);
        System.out.println("(" + System.currentTimeMillis() + "),auth()");
    }
}
