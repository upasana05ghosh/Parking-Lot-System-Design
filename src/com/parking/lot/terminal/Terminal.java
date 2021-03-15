package com.parking.lot.terminal;

public abstract class Terminal {
    private int id;
    private TerminalType type;

    public Terminal(TerminalType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
