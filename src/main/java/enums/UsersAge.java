package enums;

enum UsersAge {
    JOHN(19), DAVID(27), FELIX(23), BOB(16), JERRY(31);

    private final int age;
    UsersAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

