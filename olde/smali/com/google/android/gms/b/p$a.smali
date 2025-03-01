.class final Lcom/google/android/gms/b/p$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/p;

.field private b:Z

.field private c:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/p;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/b/p$a;->a:Lcom/google/android/gms/b/p;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p2, p3, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/b/p$a;->c:J

    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    :try_start_0
    const-string v1, "SQLITE_MASTER"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "name"

    aput-object v3, v2, v0

    const-string v3, "name=?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p0, v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v0

    move-object v0, v9

    :goto_1
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error querying for table "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    move v0, v8

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :catchall_1
    move-exception v0

    move-object v9, v1

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v9, v0

    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method public final getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/b/p$a;->b:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/b/p$a;->c:J

    const-wide/32 v2, 0x36ee80

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/b/p$a;->a:Lcom/google/android/gms/b/p;

    invoke-static {v2}, Lcom/google/android/gms/b/p;->a(Lcom/google/android/gms/b/p;)Lcom/google/android/gms/internal/f;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/f;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Database creation failed"

    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/b/p$a;->b:Z

    iget-object v1, p0, Lcom/google/android/gms/b/p$a;->a:Lcom/google/android/gms/b/p;

    invoke-static {v1}, Lcom/google/android/gms/b/p;->a(Lcom/google/android/gms/b/p;)Lcom/google/android/gms/internal/f;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/f;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/p$a;->c:J

    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/b/p$a;->b:Z

    return-object v0

    :catch_0
    move-exception v1

    iget-object v1, p0, Lcom/google/android/gms/b/p$a;->a:Lcom/google/android/gms/b/p;

    invoke-static {v1}, Lcom/google/android/gms/b/p;->c(Lcom/google/android/gms/b/p;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/p$a;->a:Lcom/google/android/gms/b/p;

    invoke-static {v2}, Lcom/google/android/gms/b/p;->b(Lcom/google/android/gms/b/p;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 2000
    invoke-static {}, Lcom/google/android/gms/b/ap;->a()I

    move-result v1

    const/16 v2, 0x9

    if-lt v1, v2, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v3}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v1, v3, v3}, Ljava/io/File;->setWritable(ZZ)Z

    invoke-virtual {v1, v4, v4}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v1, v4, v4}, Ljava/io/File;->setWritable(ZZ)Z

    .line 0
    :cond_0
    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-ge v1, v2, :cond_0

    const-string v1, "PRAGMA journal_mode=memory"

    invoke-virtual {p1, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    const-string v1, "hits2"

    invoke-static {v1, p1}, Lcom/google/android/gms/b/p$a;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/b/p;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 1000
    :cond_2
    const-string v1, "SELECT * FROM hits2 WHERE 0"

    invoke-virtual {p1, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v4

    move v1, v0

    :goto_1
    array-length v5, v4

    if-ge v1, v5, :cond_3

    aget-object v5, v4, v1

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    const-string v1, "hit_id"

    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "hit_url"

    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "hit_string"

    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "hit_time"

    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Database column missing"

    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_5
    const-string v1, "hit_app_id"

    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v0, 0x1

    :cond_6
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Database has extra columns"

    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v0, :cond_1

    const-string v0, "ALTER TABLE hits2 ADD COLUMN hit_app_id"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    return-void
.end method
