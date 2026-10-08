class Student {

    private String name;
    private int marks;

    public void setStudent(String name) {
        this.name = name;
    }

    public String getStudent() {
        return name;
    }

    public void setStudent(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        Student S = new Student();

        S.setStudent("vaishnavi");
        S.setStudent(89);

        System.out.println(S.getStudent());
        System.out.println(S.getMarks());
    }
}