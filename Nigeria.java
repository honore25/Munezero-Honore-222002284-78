// Class Egypt
class Egypt {
    public void methodEgypt() {
        System.out.println("Method from Class Egypt");
    }
}

// Class Kenya
class Kenya {
    public void methodKenya() {
        System.out.println("Method from Class Kenya");
    }
}

// Class Nigeria
class Nigeria {
    public void methodNigeria() {
        System.out.println("Method from Class Nigeria");
    }
}

// Class Morocco
class Morocco {
    public void methodMorocco() {
        System.out.println("Method from Class Morocco");
    }
}

// Cars class to create objects and call methods from Egypt, Kenya, Nigeria, and
// Morocco
class Cars {
    public static void main(String[] args) {
        Egypt objEgypt = new Egypt();
        Kenya objKenya = new Kenya();
        Nigeria objNigeria = new Nigeria();
        Morocco objMorocco = new Morocco();

        // Calling methods from each class
        objEgypt.methodEgypt();
        objKenya.methodKenya();
        objNigeria.methodNigeria();
        objMorocco.methodMorocco();
    }
}```

In this code,I'v

e renamed
the classes
to represent
the states
of Egypt, Kenya, Nigeria, and Morocco,and I'v
e updated
the method
names accordingly
.