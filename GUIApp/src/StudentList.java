
class Student {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

}

public class StudentList {

    Student[] students = new Student[0];

    public int length() {
        return students.length;

    }

    public Student get(int pos) {
        return students[pos];

    }

    public void addData(String input) {
        String[] data = input.split("\\s+");
        students = new Student[data.length / 2 + data.length];
        for (int i = 0; i < students.length; i++) {
            String name = data[2 * i];
            int grade = Integer.parseInt(data[2 * i + 1]);
            students[i] = new Student(name, grade);

        }
    }

    public void newData(String input) {
        String[] data = input.split("\\s+");
        students = new Student[data.length / 2];
        for (int i = 0; i < students.length; i++) {
            String name = data[2 * i];
            int grade = Integer.parseInt(data[2 * i + 1]);
            students[i] = new Student(name, grade);

        }
    }

    public void sortbyName() {
        for (int i = 0; i < length() - 1; i++) {
            for (int j = 0; j < length() - 1; j++) {
                if (get(j + 1).name.compareTo(get(j).name) < 0) {
                    Student tmp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = tmp;

                }
            }
        }
    }

    public void sortbyGrade() {
        for (int i = 0; i < length() - 1; i++) {
            for (int j = 0; j < length() - 1; j++) {
                if (get(j + 1).grade > get(j).grade) {
                    Student tmp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = tmp;

                }
            }
        }
    }

    public float getAvg() {
        float sum = 0.0f;
        for (int i = 0; i < length(); i++) {
            sum += get(i).grade;
        }
        return sum / length();

    }

    public int getHigh() {
        int hi = get(0).grade;
        for (int i = 0; i < length(); i++) {
            if (get(i).grade > hi) {
                hi = get(i).grade;
            }
        }
        return hi;

    }

    public int getLowest() {
        int Lowest = get(0).grade;
        for (int i = 0; i < length(); i++) {
            if (get(i).grade < Lowest) {
                Lowest = get(i).grade;
            }
        }
        return Lowest;

    }

}
