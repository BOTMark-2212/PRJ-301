/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;

/**
 *
 * @author BOT
 */
public class AccountDBContext extends DBContext {
    public Account getAccount(String username, String password) throws SQLException{
        String sql = "SELECT username,[password] FROM Account \n"
                    + "WHERE username = ?\n"
                    + "AND [password] = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, username);
        stm.setString(2, password);
        ResultSet rs = stm.executeQuery();
        ArrayList<Account> listAccounts = new ArrayList<>();
        if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                return account;
            }
        return null;
    }
}

