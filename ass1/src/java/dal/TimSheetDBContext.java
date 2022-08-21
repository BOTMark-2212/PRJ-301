/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TimeSheet;

/**
 *
 * @author BOT
 */
public class TimSheetDBContext {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    public List<TimeSheet> getTimeSheet(){
        try {
            String query = "Select Employee.employee_name, TimeSheet.employee_id, salary_level_id, TimeSheet.date, TimeSheet.shift_id, TimeSheet.working_status_id from Employee\n" +
                    "INNER JOIN TimeSheet ON\n" +
                    "Employee.employee_id = TimeSheet.employee_id";
            
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            List<TimeSheet> lTimeSheet = new ArrayList<>();
            while(rs.next()){
                TimeSheet ts = new TimeSheet(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getInt(5), rs.getInt(6));
                lTimeSheet.add(ts);
            }
            return lTimeSheet;
        } catch (SQLException ex) {
            Logger.getLogger(TimSheetDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
}
