

class NameLengthCompare implements java.util.Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.length() - s2.name.length();
    }
}
