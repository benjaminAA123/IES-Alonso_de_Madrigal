package com.iesam.AlonsoDeMadrigal.presentation;

import com.iesam.AlonsoDeMadrigal.domain.models.*;

public class Main {
    public static void main(String[] args) {


        Course course = new Course();
        System.out.println("Course");
        course.setId("1");
        course.setName("A1");
        course.setDescription("SMR");

        Subject subject = new Subject();
        System.out.println("Subject");
        subject.setId("001");
        subject.setName("Matematicas");


        Registration registration = new Registration();
        System.out.println("Registration");
        registration.setId("10");


        Pupil pupil = new Pupil();
        System.out.println("Pupil");
        pupil.setId("1001");
        pupil.setName("Federico");
        pupil.setSurname("Alevin");
        pupil.setDni("7897656F");
        pupil.setAdress("Ávila");
        pupil.setMother("Maria ");
        pupil.setFather("Jose");
        pupil.setEmail("feder1c0@gmail.com");


        Teacher teacher = new Teacher();
        System.out.println("Teacher");
        teacher.setId("101");
        teacher.setName("Noel");
        teacher.setSurname("Rodriguez");
        teacher.setDni("54654654R");
        teacher.setAdress("Zaragoza");
        teacher.setAcademicTitle("Informatica");
        teacher.setRegistDate("20/15/2020");


        Classroom classroom = new Classroom();

        TeachingRoom teachingRoom = new TeachingRoom();
        teachingRoom.setId("1");
        teachingRoom.setFloor("2");
        teachingRoom.setChairNum(15);
        teachingRoom.setCapacity("15");
        teachingRoom.setBoardType("tactile");


        PcClassroom pcClassroom = new PcClassroom();
        pcClassroom.setId("2");
        pcClassroom.setFloor("3");
        pcClassroom.setPcNumber(01);
        pcClassroom.setCapacity("30");
        pcClassroom.setPcType("destop");


        // printCourse(course);
        // printSubject(subject);
        // printRegistration(registration);
        // printPupil(pupil);
        // printTeacher(teacher);
        // printTeachingRoom(teachingRoo);
        // printPcClassroom(PcClassroom);


    }

    public void printCourse(Course course) {

        System.out.println("cod: " + course.getId() + "Name:" + course.getName() + "Description" + course.getDescription());

    }

    public void printSubject(Subject subject) {

        System.out.println("cod: " + subject.getId() + "Name:" + subject.getName() );

    }

    public void printRegistration(Registration registration) {

        System.out.println("cod: " + registration.getId() );
    }

    public void printPupil(Pupil pupil) {
        System.out.println("cod: " + pupil.getId() + "Name" + pupil.getName() + "Surname: " + pupil.getSurname() +
                "Dni" + pupil.getDni() + "Adress" + pupil.getAdress() + "Mother" + pupil.getMother() +
                "Father" + pupil.getFather() + "Email" + pupil.getEmail());

    }

    public void printTeacher(Teacher teacher) {

        System.out.println("cod: " +  teacher.getId() + "Name" + teacher.getName() + "Surname" + teacher.setSurname()
        + "Dni" + teacher.getDni() + "Adress" + teacher.getAdress()+ "AcademicTitle"
                + teacher.getAcademicTitle() + "RegistDate" );

    }
}


