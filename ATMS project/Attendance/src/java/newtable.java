import java.sql.*;
import java.time.Month;
import java.time.YearMonth;
import java.util.*;
public class newtable {
    public static void main(String[] args) {
//   
    Calendar cal = Calendar.getInstance();
    long day = cal.get(Calendar.DAY_OF_MONTH);
    int mo =cal.get(Calendar.MONTH);
    int month = mo+1;
    int year = cal.get(Calendar.YEAR);
    System.out.println(year);
    System.out.println(month);
        System.out.println(day);
        YearMonth yr = YearMonth.of(year, month);
        int length = yr.lengthOfMonth();
        System.out.println(length);
        
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/try","root","7821");
   if(day==01){                                                            //on the first day of every month
       for(int i =1;i<=length;i++){
              System.out.println(i);
              String sql1="Alter table Attendance add D"+i+" varchar(255) DEFAULT 'A'";       //ATTendance table
              PreparedStatement p = c.prepareStatement(sql1);
              p.executeUpdate();
   
   
//              String sql="Alter table Status add Task"+i+" varchar(255),add Status"+i+" varchar(255)";    //Status table
//              PreparedStatement ps = c.prepareStatement(sql);
//              ps.executeUpdate();  
   }}
   else{
              System.out.println("The day is not the first day of the month...");
   }
    
    }
catch(Exception e)
{System.out.println(e);}
    
    
    
}}
