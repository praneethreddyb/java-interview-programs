package com.programs.streams;

import com.programs.model.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsCommonPrograms {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .toList();

        // 1. Find the list of students whose rank is in between 50 and 100
        List<Student> studentsInRank = studentList.stream()
                .filter(student -> student.getMarks() >= 50 && student.getMarks() <= 100)
                .toList();
        System.out.println("Students with rank between 50 and 100: " + studentsInRank);

        //2. Find the Students who stays in Karnataka and sort them by their names
        List<Student> studentsByCity = studentList.stream()
                .filter(student->student.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getName)).toList();
        System.out.println("Students from Karnataka sorted by name: " + studentsByCity);

        //3. Find the Students who has two or more phone numbers
        List<Student> studentListWithTwoPhoneNumbers =
                studentList.stream().filter(student->student.getPhoneNumbers().size()>=2).toList();
        System.out.println("Students with two or more phone numbers: " + studentListWithTwoPhoneNumbers);

        // 3. Find all departments names
        List<String> departments = studentList.stream()
                .map(Student::getDepartment)
                .distinct()
                .toList();
        System.out.println("Departments: " + departments);

        // 4. Find the student with maximum marks
        Student studentWithMaxMarks = studentList.stream()
                .max(Comparator.comparingInt(Student::getMarks))
                .orElse(null);
        System.out.println("Student with maximum marks: " + studentWithMaxMarks);

        // 5. Find the student with minimum marks
        Student studentWithMinMarks = studentList.stream()
                .min(Comparator.comparingInt(Student::getMarks))
                .orElse(null);
        System.out.println("Student with minimum marks: " + studentWithMinMarks);

        // 6. Find the average marks of all students
        double averageMarks = studentList.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0);
        System.out.println("Average marks of all students: " + averageMarks);

        // 7. Find the total number of students
        long totalStudents = studentList.size();
        System.out.println("Total number of students: " + totalStudents);

        // 8. Find the student with the highest age

        Student studentWithMaxAge = studentList.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .orElse(null);
        System.out.println("Student with maximum age: " + studentWithMaxAge);

        // 9. Find the student with the lowest age
        Student studentWithMinAge = studentList.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .orElse(null);
        System.out.println("Student with minimum age: " + studentWithMinAge);

        // 10. Find the student with the longest name
        Student studentWithLongestName = studentList.stream()
                .max(Comparator.comparingInt(student -> student.getName().length()))
                .orElse(null);
        System.out.println("Student with longest name: " + studentWithLongestName);

        // 11. Find the student with the shortest name
        Student studentWithShortestName = studentList.stream()
                .min(Comparator.comparingInt(student -> student.getName().length()))
                .orElse(null);
        System.out.println("Student with shortest name: " + studentWithShortestName);

        // 12. Find the student with the most phone numbers
        Student studentWithMostPhoneNumbers = studentList.stream()
                .max(Comparator.comparingInt(student -> student.getPhoneNumbers().size()))
                .orElse(null);
        System.out.println("Student with most phone numbers: " + studentWithMostPhoneNumbers);

        // 13. Find the student with the least phone numbers
        Student studentWithLeastPhoneNumbers = studentList.stream()
                .min(Comparator.comparingInt(student -> student.getPhoneNumbers().size()))
                .orElse(null);
        System.out.println("Student with least phone numbers: " + studentWithLeastPhoneNumbers);

     List<String> phoneNumbers = studentList.stream().flatMap(student->student.getPhoneNumbers().stream()).toList();
        System.out.println("All phone numbers: " + studentList.stream()
                .flatMap(student -> student.getPhoneNumbers().stream())
                .toList());
        System.out.println("All phone numbers: " + phoneNumbers);

        //5.  Group The Student By Department Names
        Map<String, List<Student>> studentsGroupByDeptName = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println("Students grouped by department: " + studentsGroupByDeptName);

        Map.Entry<String, Long> result = studentList.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Department with most students: " + result.getKey() + " with " + result.getValue() + " students");

        //7. Find the average age of male and female students
        Map<String, Double> averageAgeByGender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average Age By Gender: " + averageAgeByGender);

        //8. Find the highest rank in each department
        Map<String, Student> highestRankByDepartment = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getMarks)), Optional::get)));
        System.out.println("Highest rank by department: " + highestRankByDepartment);

        //9 .Find the student who has second rank
        Student secondRankStudent = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Student with second rank: " + secondRankStudent);

    }
}