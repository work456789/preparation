package com.preparation.designpatterns.adapter;

/**
 * Client code to test the adapter
 */
public class Client {
    public static void main(String[] args) {
        //existing device with a two-pin socket
        TwoPinSocket twoPinDevice = new TwoPinSocket();

        //Create an adapter to use the two-pin device with a three-pin socket
        ThreePinSocket adapter = new SocketAdapter(twoPinDevice);

        adapter.plugInThreePin();
    }
}
