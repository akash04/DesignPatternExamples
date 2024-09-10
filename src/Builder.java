class Car {
    private String engine;
    private int wheels;
    private String color;

    public static class Builder {
        private String engine;
        private int wheels;
        private String color;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.engine = this.engine;
            car.wheels = this.wheels;
            car.color = this.color;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
