.class public final Lcom/saterskog/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/b/a$a;
    }
.end annotation


# static fields
.field public static a:I

.field static b:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field static c:J

.field static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    sput v2, Lcom/saterskog/b/a;->a:I

    .line 22
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lcom/saterskog/b/a;->b:Ljava/util/Hashtable;

    .line 24
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/saterskog/b/a;->c:J

    .line 25
    sput v2, Lcom/saterskog/b/a;->d:I

    return-void
.end method

.method public static a(Landroid/content/Context;)J
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v2, 0x0

    const-wide/16 v0, -0x1

    .line 111
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 9126
    new-array v5, v10, [J

    invoke-static {v3, v4}, Lcom/saterskog/b/a;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)J

    move-result-wide v6

    aput-wide v6, v5, v2

    const/4 v6, 0x1

    .line 9127
    invoke-static {v3, v4}, Lcom/saterskog/b/a;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)J

    move-result-wide v8

    aput-wide v8, v5, v6

    move v4, v2

    .line 9160
    :goto_0
    if-ge v4, v10, :cond_1

    aget-wide v2, v5, v4

    .line 9161
    cmp-long v6, v2, v0

    if-eqz v6, :cond_0

    .line 112
    :goto_1
    const-wide v4, 0x1439c7eeb00L

    cmp-long v4, v2, v4

    if-gez v4, :cond_2

    .line 114
    :goto_2
    return-wide v0

    .line 9160
    :cond_0
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_0

    :cond_1
    move-wide v2, v0

    .line 9163
    goto :goto_1

    :cond_2
    move-wide v0, v2

    .line 114
    goto :goto_2
.end method

.method private static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)J
    .locals 4

    .prologue
    const-wide/16 v0, -0x1

    .line 132
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 133
    new-instance v3, Ljava/io/File;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->lastModified()J
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 136
    :cond_0
    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 4

    .prologue
    .line 166
    long-to-double v0, p0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    .line 168
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 169
    :cond_0
    const-string v0, "NaN"

    .line 171
    :goto_0
    return-object v0

    :cond_1
    double-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a()V
    .locals 0

    .prologue
    .line 48
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 69
    sget v0, Lcom/saterskog/b/a;->a:I

    if-ge v0, v1, :cond_0

    .line 70
    const-string v0, "ZDebug"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    sget v0, Lcom/saterskog/b/a;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/saterskog/b/a;->a:I

    .line 74
    :cond_0
    sget v0, Lcom/saterskog/b/a;->a:I

    if-ne v0, v1, :cond_1

    .line 76
    const-string v0, "Not printing further errors (100 already)"

    .line 77
    const-string v1, "ZDebug"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    sget v0, Lcom/saterskog/b/a;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/saterskog/b/a;->a:I

    .line 82
    :cond_1
    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 90
    const-class v1, Lcom/saterskog/b/a;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/saterskog/b/a$a;

    invoke-interface {v0}, Lcom/saterskog/b/a$a;->a()Lcom/google/android/gms/b/g;

    move-result-object v0

    .line 1000
    const-string v2, "&cd"

    invoke-virtual {v0, v2, p0}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v2, Lcom/google/android/gms/b/d$a;

    invoke-direct {v2}, Lcom/google/android/gms/b/d$a;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/b/d$a;->a()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/g;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    monitor-exit v1

    return-void

    .line 90
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V
    .locals 6

    .prologue
    .line 102
    const-class v1, Lcom/saterskog/b/a;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/saterskog/b/a$a;

    invoke-interface {v0}, Lcom/saterskog/b/a$a;->a()Lcom/google/android/gms/b/g;

    move-result-object v0

    .line 103
    new-instance v2, Lcom/google/android/gms/b/d$e;

    invoke-direct {v2}, Lcom/google/android/gms/b/d$e;-><init>()V

    .line 6000
    const-string v3, "&utc"

    invoke-virtual {v2, v3, p0}, Lcom/google/android/gms/b/d$e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 7000
    const-string v3, "&utt"

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/d$e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 8000
    const-string v3, "&utv"

    invoke-virtual {v2, v3, p1}, Lcom/google/android/gms/b/d$e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 107
    invoke-static {p2, p3}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v3

    .line 9000
    const-string v4, "&utl"

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/b/d$e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 108
    invoke-virtual {v2}, Lcom/google/android/gms/b/d$e;->a()Ljava/util/Map;

    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/g;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit v1

    return-void

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V
    .locals 5

    .prologue
    .line 95
    const-class v1, Lcom/saterskog/b/a;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/saterskog/b/a$a;

    invoke-interface {v0}, Lcom/saterskog/b/a$a;->a()Lcom/google/android/gms/b/g;

    move-result-object v0

    .line 97
    new-instance v2, Lcom/google/android/gms/b/d$b;

    invoke-direct {v2}, Lcom/google/android/gms/b/d$b;-><init>()V

    .line 2000
    const-string v3, "&ec"

    invoke-virtual {v2, v3, p0}, Lcom/google/android/gms/b/d$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 3000
    const-string v3, "&ea"

    invoke-virtual {v2, v3, p1}, Lcom/google/android/gms/b/d$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 4000
    const-string v3, "&el"

    invoke-virtual {v2, v3, p2}, Lcom/google/android/gms/b/d$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 5000
    const-string v3, "&ev"

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/d$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 98
    invoke-virtual {v2}, Lcom/google/android/gms/b/d$b;->a()Ljava/util/Map;

    move-result-object v2

    .line 97
    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/g;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    monitor-exit v1

    return-void

    .line 95
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 66
    const-string v0, "ZDebug"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 62
    const-string v0, "ZDebug"

    const-string v1, "no message"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    return-void
.end method

.method public static b(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 10123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 118
    const-wide v2, 0x15334031761L

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    .line 119
    const-wide/16 v0, -0x1

    .line 120
    :goto_0
    return-wide v0

    :cond_0
    invoke-static {p0}, Lcom/saterskog/b/a;->a(Landroid/content/Context;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0
.end method

.method private static b(Landroid/content/pm/PackageManager;Ljava/lang/String;)J
    .locals 5

    .prologue
    const-wide/16 v0, -0x1

    .line 144
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 145
    const-class v3, Landroid/content/pm/PackageInfo;

    const-string v4, "firstInstallTime"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 146
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 156
    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    goto :goto_0

    .line 154
    :catch_1
    move-exception v2

    goto :goto_0

    :catch_2
    move-exception v2

    goto :goto_0

    :catch_3
    move-exception v2

    goto :goto_0

    .line 149
    :catch_4
    move-exception v2

    goto :goto_0
.end method

.method public static b()V
    .locals 0

    .prologue
    .line 59
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 84
    const-string v0, "ZDebug"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    return-void
.end method

.method public static c()J
    .locals 2

    .prologue
    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
