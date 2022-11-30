package com.example.qlktx.models.BO;

import com.example.qlktx.models.BEAN.Student;
import com.example.qlktx.models.DAO.StudentDAO;
import com.example.qlktx.models.BEAN.Student;
import com.example.qlktx.models.DAO.StudentDAO;

import java.util.List;

public class StudentBO {
    public static List<Student> getStudent()
    {
        return StudentDAO.getStudents();
    }

    public static List<Student> getStudentsByName(String name)
    {
        return  StudentDAO.getStudentsByName(name);
    }

    public static void addStudent(int room_id, String name, String date, int sex, String cccd, String phone_number, String uni, String facuty, String _class, String date_from, String date_to)
    {
        StudentDAO.addStudent(room_id, name, date, sex, cccd, phone_number, uni, facuty, _class, date_from, date_to);
    }

    public static void updateStudent(int id, int room_id, String name, String date, int sex, String cccd, String phone_number, String uni, String facuty, String _class, String date_from, String date_to)
    {
        StudentDAO.updateStudent(id, room_id, name, date, sex, cccd, phone_number, uni, facuty, _class, date_from, date_to);
    }

    public static void deleteStudent(int id)
    {
        StudentDAO.deleteStudent(id);
    }
}
