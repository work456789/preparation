package com.preparation.adapter2;

public class GermanToUkSocketAdapter extends UKElectricalSocket {
    private GermanElectricalSocket germanElectricalSocket;

    public GermanToUkSocketAdapter(GermanElectricalSocket germanElectricalSocket) {
        this.germanElectricalSocket = germanElectricalSocket;
    }

    public void provideElectricity() {
        this.germanElectricalSocket.provideElectricity();
    }
}
