package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Student;
import com.example.qlktx.models.BEAN.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDAO {
    public static List<Student> getStudents()
    {
        try{



            Statement stmt = ConnectDB.connectionDB();

            String sql = "select student.id, room.name, student.name, student.date, student.sex, student.cccd, student.phone_number, student.uni, student.faculty, student.class, student.date_from, student.date_to from student, room where student.room_id = room.id";

            ResultSet rs = stmt.executeQuery(sql);

            List<Student> students = new ArrayList<Student>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String room_name = rs.getString("room.name");
                String student_name = rs.getString("student.name");
                Date date = rs.getDate("date");
                int sex = rs.getInt("sex");
                String cccd = rs.getString("cccd");
                String phone_number = rs.getString("phone_number");
                String uni = rs.getString("uni");
                String faculty = rs.getString("faculty");
                String _class = rs.getString("class");
                Date date_from = rs.getDate("date_from");
                Date date_to = rs.getDate("date_to");
                students.add(new Student(id, room_name, student_name, date, sex, cccd, phone_number, uni, faculty, _class, date_from, date_to));
            }

            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> getStudentsByName(String name)
    {
        try{
            Statement stmt = ConnectDB.connectionDB();

            String sql = "select student.id, room.name, student.name, student.date, student.sex, student.cccd, student.phone_number, student.uni, student.faculty, student.class, student.date_from, student.date_to from student, room where student.room_id = room.id and student.name like '%"+name.trim()+"%'";

            ResultSet rs = stmt.executeQuery(sql);

            List<Student> students = new ArrayList<Student>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String room_name = rs.getString("room.name");
                String student_name = rs.getString("student.name");
                Date date = rs.getDate("date");
                int sex = rs.getInt("sex");
                String cccd = rs.getString("cccd");
                String phone_number = rs.getString("phone_number");
                String uni = rs.getString("uni");
                String faculty = rs.getString("faculty");
                String _class = rs.getString("class");
                Date date_from = rs.getDate("date_from");
                Date date_to = rs.getDate("date_to");
                students.add(new Student(id, room_name, student_name, date, sex, cccd, phone_number, uni, faculty, _class, date_from, date_to));
            }

            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Student> getStudentsByRoom(String txt)
    {
        try{
            Statement stmt = ConnectDB.connectionDB();

            String sql = "select student.id, room.name, student.name, student.date, student.sex, student.cccd, student.phone_number, student.uni, student.faculty, student.class, student.date_from, student.date_to from student, room where student.room_id = room.id and room.name like '%"+txt.trim()+"%'";

            ResultSet rs = stmt.executeQuery(sql);

            List<Student> students = new ArrayList<Student>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String room_name = rs.getString("room.name");
                String student_name = rs.getString("student.name");
                Date date = rs.getDate("date");
                int sex = rs.getInt("sex");
                String cccd = rs.getString("cccd");
                String phone_number = rs.getString("phone_number");
                String uni = rs.getString("uni");
                String faculty = rs.getString("faculty");
                String _class = rs.getString("class");
                Date date_from = rs.getDate("date_from");
                Date date_to = rs.getDate("date_to");
                students.add(new Student(id, room_name, student_name, date, sex, cccd, phone_number, uni, faculty, _class, date_from, date_to));
            }

            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addStudent(int room_id, String name, String date, int sex, String cccd, String phone_number, String uni, String facuty, String _class, String date_from, String date_to)
    {
        try{
            Statement stmt = ConnectDB.connectionDB();

            String sql = "insert into student (room_id, name, date, sex, cccd, phone_number, uni, faculty, class, date_from, date_to) values ('"+room_id+"', '"+name.trim()+"', '"+date.trim()+"', '"+sex+"', '"+cccd.trim()+"', '"+phone_number.trim()+"', '"+uni.trim()+"', '"+facuty.trim()+"', '"+_class.trim()+"', '"+date_from.trim()+"', '"+date_to.trim()+"')";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateStudent(int id, int room_id, String name, String date, int sex, String cccd, String phone_number, String uni, String facuty, String _class, String date_from, String date_to)
    {
        try{
            Statement stmt = ConnectDB.connectionDB();

            String sql = "update student set room_id='"+room_id+"', name='"+name.trim()+"', date='"+date.trim()+"', sex='"+sex+"', cccd='"+cccd.trim()+"', phone_number='"+phone_number.trim()+"', uni='"+uni.trim()+"', faculty='"+facuty.trim()+"', class='"+_class.trim()+"', date_from='"+date_from.trim()+"', date_to='"+date_to.trim()+"' where id='"+id+"'";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteStudent(int id)
    {
        try{
            Statement stmt = ConnectDB.connectionDB();

            String sql = "delete from student where id='"+id+"'";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[])
    {
        StudentDAO rd = new StudentDAO();
//        rd.addStudent(1, "ABC", "2021-01-02", 1, "3432", "3534456", "DH KT", "QTKD", "20KT","2021-01-02","2021-01-02");
//        rd.deleteStudent(4);
//        rd.updateStudent(6,2, "ABC", "2021-07-22", 1, "362", "0135678595", "DH KT", "QTKD", "2QT", "2021-01-02","2021-01-02");
//        rd.deleteStudent(5);
        rd.getStudentsByRoom("B508");
        List<Student> students = rd.getStudents();
        for (Student r:students
             ) {
            System.out.println(r.getId());
            System.out.println(r.getRoom_name());
            System.out.println(r.getName());
            System.out.println(r.getDate());
            System.out.println(r.getSex());
            System.out.println(r.getCccd());
            System.out.println(r.getPhone_number());
            System.out.println(r.getUni());
            System.out.println(r.getFaculty());
            System.out.println(r.get_class());

        }
    }

}
