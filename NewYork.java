// Class NewYork
class NewYork {
    public void methodNewYork() {
        System.out.println("Method from Class NewYork");
    }
}

// Class LosAngeles
class LosAngeles {
    public void methodLosAngeles() {
        System.out.println("Method from Class LosAngeles");
    }
}

// Class Chicago
class Chicago {
    public void methodChicago() {
        System.out.println("Method from Class Chicago");
    }
}

// Class Miami
class Miami {
    public void methodMiami() {
        System.out.println("Method from Class Miami");
    }
}

// Cars class to create objects and call methods from NewYork, LosAngeles, Chicago, and Miami
class Cars {
    public static void main(String[] args) {
        NewYork objNewYork = new NewYork();
        LosAngeles objLosAngeles = new LosAngeles();
        Chicago objChicago = new Chicago();
        Miami objMiami = new Miami();

        // Calling methods from each class
        objNewYork.methodNewYork();
        objLosAngeles.methodLosAngeles();
        objChicago.methodChicago();
        objMiami.methodMiami();
    }
}
