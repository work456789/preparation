package com.preparation.designpatterns.builder;

public class House {
    private String foundation;
    private String floor;
    private String roof;
    private String yard;

    public House(Builder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.floor = houseBuilder.floor;
        this.roof = houseBuilder.roof;
        this.yard = houseBuilder.yard;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", floor='" + floor + '\'' +
                ", roof='" + roof + '\'' +
                ", yard='" + yard + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house = new Builder("foundation", "floor").build();
    }

    static class Builder {
        private String foundation;
        private String floor;
        private String roof;
        private String yard;

        Builder(String foundation, String floor) {
            this.foundation = foundation;
            this.floor = floor;
        }

        public Builder withRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder withYard(String yard) {
            this.yard = yard;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
