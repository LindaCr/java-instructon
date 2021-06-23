package db;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

import interfaces.DAO;

public class ActorDB extends BaseDB implements DAO<Actor>{
	


	@Override
	public Actor get(int id) {
		Actor actor= null;
		String sql=("Select * from actor where id=?");
		try (PreparedStatement stmt=getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs= stmt.executeQuery();
			if (rs.next()) {
				actor=getActorFromRow(rs);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return actor;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors=new ArrayList<>();
		try (Statement stmt=getConnection().createStatement()){
			ResultSet rs= stmt.executeQuery("Select *  from actor order by id");
			while (rs.next()) {
				Actor actor = getActorFromRow(rs);
				actors.add(actor);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return actors;
	}

	@Override
	public boolean add(Actor actor) {
		boolean success=false;
		String sql= "insert into actor (firstName, lastName, gender, birthdate) values (?,?,?,?)";
		try (PreparedStatement stmt= getConnection().prepareStatement(sql)) {
			stmt.setString(1, actor.getFirstName());
			stmt.setString(2, actor.getLastName());
			stmt.setString(3, actor.getGender());
			stmt.setString(4, actor.getBirthdate().toString());
			int rowsAffected= stmt.executeUpdate();
			if (rowsAffected==1) {
				success=true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Actor actor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Actor actor) {
		boolean success=false;
		String sql= "delete from actor where id = ?";
		try (PreparedStatement stmt= getConnection().prepareStatement(sql)) {
			stmt.setInt(1, actor.getid());
			int rowsAffected= stmt.executeUpdate();
			if (rowsAffected==1) {
				success=true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}


	private Actor getActorFromRow(ResultSet rs) throws SQLException {
		//for each row parse an item
		int id=rs.getInt(1);
		String firstName= rs.getString(2);
		String lastName= rs.getString(3);
		String gender= rs.getString(4);
		String birthdateStr= rs.getString(5);
		LocalDate birthdate= LocalDate.parse(birthdateStr);
		Actor actor=new Actor (id, firstName, lastName, gender, birthdate);
		return actor;
	}
	
	
}
