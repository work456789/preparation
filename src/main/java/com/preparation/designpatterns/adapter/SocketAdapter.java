package com.preparation.designpatterns.adapter;

/**
 * the Adapter
 */
public class SocketAdapter implements ThreePinSocket {
    private TwoPinSocket twoPinSocket;

    public SocketAdapter(TwoPinSocket twoPinSocket) {
        this.twoPinSocket = twoPinSocket;
    }

    @Override
    public void plugInThreePin() {
        System.out.println("Adapter: Converting three-pin socket to two-pin.");
        twoPinSocket.pluginTwoPin();
    }
}
