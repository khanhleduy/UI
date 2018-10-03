package l.com.ldk.duykhanh.bestui.DATABASE;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dbBook";
    private static final int VERSION = 1;

    private static final String TABLE_USER = "User";
    private static final String ID_USER = "idUser";
    private static final String NAME_USER = "username";
    private static final String PASS_USER = "password";
    private static final String PHONE_USER = "phone";
    private static final String FULLNAME_USER = "fullname";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CreateTableUser = "CREATE TABLE " + TABLE_USER + "( " + ID_USER + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NAME_USER + "TEXT, " + PASS_USER + "TEXT, " + PHONE_USER + "TEXT, " + FULLNAME_USER + "TEXT); ";
        db.execSQL(CreateTableUser);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }
}
