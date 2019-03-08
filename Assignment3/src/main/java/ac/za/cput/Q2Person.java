package ac.za.cput;

public class Q2Person {

    private String name;
    private String surname;
    private int age;

    public Q2Person(){
    }

    public Q2Person(int personAge, String personName, String personSurname){
        setAge(personAge);
        setName(personName);
        setSurname(personSurname);
    }

    public void setAge(int personAge){
        this.age = personAge;
    }

    public int getAge(){
        return age;
    }

    public void setName(String personName){
        this.name = personName;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String personSurname){
        this.surname = personSurname;
    }
    public String getSurname(){
        return surname;
    }

    @Override
    public boolean equals(Object p) {

        boolean isSameObject = false;
        boolean isPerson = false;
        boolean hasSameValues = false;
        boolean isEqual = false;

        ((Q2Person) p).setAge(25);
        ((Q2Person) p).setName("Henry");
        ((Q2Person) p).setSurname("Jones");

        if (p == this) {
            isSameObject = true;
        }
        if (p instanceof Q2Person){
            isPerson = true;
        }

        Q2Person c = (Q2Person) p;

        boolean sameID = ((Q2Person) p).getAge() == c.getAge();
        boolean sameName = ((Q2Person) p).getName().equals(c.getName());
        boolean sameSurname = ((Q2Person) p).getSurname().equals(c.getSurname());

        if(sameID && sameName && sameSurname){
            hasSameValues = true;
        }
        if(isSameObject && isPerson && hasSameValues){
            isEqual = true;
        }
        return isEqual;
    }
}
