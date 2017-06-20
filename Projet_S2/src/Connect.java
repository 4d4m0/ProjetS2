import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.ds.common.BaseDataSource;

/**
 * Une classe permettant d'initialiser la connection � la base de donn�es et
 * faire quelques tests si n�cessaire
 */
public class Connect {
	private static final BaseDataSource DS;

	static {
		/** Configurer la source de donn�es */
		DS = new PGSimpleDataSource();
		DS.setServerName("localhost");
		DS.setDatabaseName("Projet_S2");
		DS.setUser("postgres");
		DS.setPassword("admin");
	}

	/**
	 * Construction d�sactiv�e
	 */
	private Connect() {
		throw new IllegalStateException();
	}

	/**
	 * Supprime toutes les donn�es de la base
	 * 
	 * @param con
	 * @throws SQLException
	 */
	public static void clean(Connection con) throws SQLException {
		try (Statement stmt = con.createStatement()) {
			stmt.executeUpdate("TRUNCATE TABLE root");
		}
	}

	/**
	 * @return une connection � la base de donn�es
	 * @throws SQLException
	 */
	public static Connection connect() throws SQLException {
		return DS.getConnection();
	}

}