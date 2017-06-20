import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.ds.common.BaseDataSource;

/**
 * Une classe permettant d'initialiser la connection à la base de données et
 * faire quelques tests si nécessaire
 */
public class Connect {
	private static final BaseDataSource DS;

	static {
		/** Configurer la source de données */
		DS = new PGSimpleDataSource();
		DS.setServerName("localhost");
		DS.setDatabaseName("Projet_S2");
		DS.setUser("postgres");
		DS.setPassword("admin");
	}

	/**
	 * Construction désactivée
	 */
	private Connect() {
		throw new IllegalStateException();
	}

	/**
	 * Supprime toutes les données de la base
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
	 * @return une connection à la base de données
	 * @throws SQLException
	 */
	public static Connection connect() throws SQLException {
		return DS.getConnection();
	}

}