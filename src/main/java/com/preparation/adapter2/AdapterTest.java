package com.preparation.adapter2;

public class AdapterTest {

    public static void main (String [] args) {
        GermanPlugConnector germanPlugConnector = new GermanPlugConnector();
        GermanElectricalSocket germanElectricalSocket = new GermanElectricalSocket();
        germanPlugConnector.plugInTo(germanElectricalSocket);

        UKPlugConnector ukPlugConnector = new UKPlugConnector();
        //doesn't work
        // ukPlugConnector.plugInTo(germanElectricalSocket);
        GermanToUkSocketAdapter germanToUkPlugConnectorAdapter
                = new GermanToUkSocketAdapter(germanElectricalSocket);
        ukPlugConnector.plugInTo(germanToUkPlugConnectorAdapter);
    }
}