/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import dbContext.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Article;

/**
 *
 * @author ThangCoi
 */
public class ArticleDAO {

    DBContext db = new DBContext();
    CloseConnection close = new CloseConnection();
    Connection conn;

    public ArrayList<Article> getTop4Article() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<Article> list = new ArrayList<>();
        try {
            conn = db.getConnection();
            String sql = "Select top 4 * from Article order by [date] desc";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt("id"));
                a.setImage(db.getImagePath() + rs.getString("image"));
                a.setTitle(rs.getString("title"));
                a.setType(rs.getString("type"));
                a.setContent(rs.getString("content"));
                a.setDate(rs.getDate("date"));
                a.setLike(rs.getInt("like"));
                a.setComment(rs.getInt("comment"));
                a.setIcon(db.getImagePath() + rs.getString("icon"));
                list.add(a);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return list;
    }

    public ArrayList<Article> pagging(int pageIndex, int pageSize) throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<Article> list = new ArrayList<>();
        try {
            conn = db.getConnection();
            String sql = "with r as (\n"
                    + "select *, row_number() over(order by date) as rn\n"
                    + "from Article\n"
                    + ")\n"
                    + "select * from r where rn between ? and ?";

            st = conn.prepareStatement(sql);
            int beginIndex = (pageIndex * pageSize) - (pageSize - 1);
            int endIndex = pageIndex * pageSize;
            st.setInt(1, beginIndex);
            st.setInt(2, endIndex);
            rs = st.executeQuery();

            while (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt("id"));
                a.setImage(db.getImagePath() + rs.getString("image"));
                a.setTitle(rs.getString("title"));
                a.setType(rs.getString("type"));
                a.setContent(rs.getString("content"));
                a.setDate(rs.getDate("date"));
                a.setLike(rs.getInt("like"));
                a.setComment(rs.getInt("comment"));
                a.setIcon(db.getImagePath() + rs.getString("icon"));
                list.add(a);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return list;
    }

    public int getTotalCount() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = db.getConnection();
            String sql = "Select count(id) as [tc] from Article";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                int count = rs.getInt("tc");
                return count;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return 0;
    }

    public Article getDetail(int id) throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = db.getConnection();
            String sql = "Select * from Article where id=?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt("id"));
                a.setImage(db.getImagePath() + rs.getString("image"));
                a.setTitle(rs.getString("title"));
                a.setType(rs.getString("type"));
                a.setContent(rs.getString("content"));
                a.setDate(rs.getDate("date"));
                a.setLike(rs.getInt("like"));
                a.setComment(rs.getInt("comment"));
                a.setIcon(db.getImagePath() + rs.getString("icon"));
                return a;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

    public Date mindate() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = db.getConnection();
            String sql = "select min(date) as date from Article";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate("date");
                return date;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

    public Date maxdate() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = db.getConnection();
            String sql = "select max(date) as date from Article";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate("date");
                return date;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

}
