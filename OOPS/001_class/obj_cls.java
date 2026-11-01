class obj_cls {
    public static void main(String[] args) {

        car Tesla = new car();
        Tesla.ride();

        car bularo = new car();
        System.out.println(bularo);
        /*
         * car hello;
         * System.out.println("this reference variable is not pointing to anything"
         * +hello);
         */

        // the following example shows how the default value of the variable is accessed
        // when we haven't assigned any value to the instance variable.
        car porshe = new car();
        System.out.println(porshe.speed);
        porshe.speed = 90;
        System.out.println(porshe.speed);

        // -------------------------------------------------------------------------------------

        System.out.println("Constructor -- initialize all the properties together ");
        car bugati = new car(100, "V8"); // check the second function created
        System.out.println(bugati.speed);

        System.out.println("printing reference variable will give class+hashcode combo");
        System.out.println("Class+hashcombo for printing porshe : "+porshe);
    }
}

class car {
    int speed;
    String engine;
    int model_name;

    car() {
    }

    car(int saped, String ngen) {
        saped = speed;
        ngen = engine;
    }

    car(int speed, String engine, int model_name) {
        this.speed = speed;
        this.engine = engine;
        this.model_name = model_name;
    }

    public void ride() {
        System.out.println("The car unlock riding feature");
    };

    public void wheels() {
        System.out.println("This car has wheels");
    }

    public void windows() {
        System.out.println("This car has window");
    }
}
