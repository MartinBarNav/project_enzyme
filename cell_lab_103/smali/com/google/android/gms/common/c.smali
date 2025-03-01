.class public final Lcom/google/android/gms/common/c;
.super Ljava/lang/Object;


# static fields
.field public static a:Z

.field public static b:Z

.field private static c:I

.field private static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/common/c;->a:Z

    sput-boolean v0, Lcom/google/android/gms/common/c;->b:Z

    const/4 v0, -0x1

    sput v0, Lcom/google/android/gms/common/c;->c:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    .prologue
    .line 0
    invoke-static {p0}, Lcom/google/android/gms/common/c;->b(Landroid/content/Context;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 4000
    sparse-switch v1, :sswitch_data_0

    const/4 v0, 0x0

    .line 0
    :goto_0
    const-string v2, "GooglePlayServicesUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GooglePlayServices not available due to error "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/a;-><init>(I)V

    throw v0

    .line 4000
    :sswitch_0
    const-string v0, "com.google.android.gms"

    invoke-static {v0}, Lcom/google/android/gms/internal/c;->b(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/gms/internal/c;->a()Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    const-string v0, "com.google.android.gms"

    invoke-static {v0}, Lcom/google/android/gms/internal/c;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    .line 0
    :cond_0
    new-instance v2, Lcom/google/android/gms/common/b;

    const-string v3, "Google Play Services not available"

    invoke-direct {v2, v1, v3, v0}, Lcom/google/android/gms/common/b;-><init>(ILjava/lang/String;Landroid/content/Intent;)V

    throw v2

    :cond_1
    return-void

    .line 4000
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_2
        0x2a -> :sswitch_1
    .end sparse-switch
.end method

.method private static a()Z
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/common/c;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/google/android/gms/common/c;->b:Z

    :goto_0
    return v0

    :cond_0
    const-string v0, "user"

    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private static a(Landroid/content/pm/PackageManager;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/common/c;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget v3, Lcom/google/android/gms/common/c;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    :try_start_1
    const-string v3, "com.google.android.gms"

    const/16 v4, 0x40

    invoke-virtual {p0, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [[B

    const/4 v5, 0x0

    sget-object v6, Lcom/google/android/gms/common/f;->E:[[B

    const/4 v7, 0x1

    aget-object v6, v6, v7

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;[[B)[B

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    sput v3, Lcom/google/android/gms/common/c;->c:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v2, Lcom/google/android/gms/common/c;->c:I

    if-eqz v2, :cond_2

    :goto_1
    return v0

    :cond_1
    const/4 v3, 0x0

    :try_start_3
    sput v3, Lcom/google/android/gms/common/c;->c:I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    const/4 v3, 0x0

    :try_start_4
    sput v3, Lcom/google/android/gms/common/c;->c:I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method private static a(Landroid/content/pm/PackageInfo;Z)[B
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const-string v0, "GooglePlayServicesUtil"

    const-string v2, "Package has more than one signature."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    aget-object v0, v0, v5

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v2

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/f;->a()Ljava/util/Set;

    move-result-object v0

    :goto_1
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/common/f;->b()Ljava/util/Set;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, "GooglePlayServicesUtil"

    const/4 v3, 0x2

    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "GooglePlayServicesUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Signature not valid.  Found: \n"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method private static varargs a(Landroid/content/pm/PackageInfo;[[B)[B
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_0

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Package has more than one signature."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v2

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    move v0, v1

    :goto_1
    array-length v3, p1

    if-ge v0, v3, :cond_2

    aget-object v3, p1, v0

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "GooglePlayServicesUtil"

    const/4 v3, 0x2

    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "GooglePlayServicesUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Signature not valid.  Found: \n"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    move-object v0, v2

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;)I
    .locals 11

    .prologue
    const/4 v4, 0x2

    const/16 v3, 0x9

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    sget-boolean v0, Lcom/google/android/gms/internal/b;->a:Z

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v5, Lcom/google/android/gms/a$a;->common_google_play_services_unknown_issue:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-boolean v0, Lcom/google/android/gms/internal/b;->a:Z

    if-nez v0, :cond_2

    .line 1000
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x80

    invoke-virtual {v5, v7, v8}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :goto_1
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v5, "com.google.android.gms.version"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const v5, 0x648278

    if-eq v0, v5, :cond_2

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected 6587000 but found "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 0
    :catch_0
    move-exception v0

    const-string v0, "GooglePlayServicesUtil"

    const-string v5, "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."

    invoke-static {v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1000
    :catch_1
    move-exception v5

    const-string v7, "GooglePlayServicesUtil"

    const-string v8, "This should never happen."

    invoke-static {v7, v8, v5}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A required meta-data tag in your app\'s AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 0
    :cond_2
    :try_start_2
    const-string v0, "com.google.android.gms"

    const/16 v5, 0x40

    invoke-virtual {v6, v0, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v5

    iget v0, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Lcom/google/android/gms/internal/e;->b(I)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lcom/google/android/gms/common/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_2
    const/4 v7, 0x3

    new-array v7, v7, [[B

    sget-object v8, Lcom/google/android/gms/common/f;->a:[[B

    aget-object v8, v8, v0

    aput-object v8, v7, v1

    sget-object v8, Lcom/google/android/gms/common/f;->g:[[B

    aget-object v8, v8, v0

    aput-object v8, v7, v2

    sget-object v8, Lcom/google/android/gms/common/f;->f:[[B

    aget-object v0, v8, v0

    aput-object v0, v7, v4

    invoke-static {v5, v7}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;[[B)[B

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play Services signature invalid on Glass."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    :goto_3
    return v2

    :catch_2
    move-exception v0

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play services is missing."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_3
    move v0, v2

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const/16 v0, 0x40

    :try_start_3
    invoke-virtual {v6, v7, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v8

    .line 2000
    if-nez v8, :cond_6

    move v0, v1

    .line 0
    :cond_5
    :goto_4
    if-nez v0, :cond_f

    const-string v0, "GooglePlayServicesUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Calling package "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v8, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " signature invalid on Glass."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto :goto_3

    .line 3000
    :cond_6
    invoke-static {v6}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageManager;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {}, Lcom/google/android/gms/common/c;->a()Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    move v0, v2

    .line 2000
    :goto_5
    if-eqz v0, :cond_a

    const/4 v0, 0x1

    invoke-static {v8, v0}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;Z)[B

    move-result-object v0

    if-eqz v0, :cond_9

    move v0, v2

    goto :goto_4

    :cond_8
    move v0, v1

    .line 3000
    goto :goto_5

    :cond_9
    move v0, v1

    .line 2000
    goto :goto_4

    :cond_a
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;Z)[B

    move-result-object v0

    if-eqz v0, :cond_b

    move v0, v2

    :goto_6
    if-nez v0, :cond_5

    const/4 v9, 0x1

    invoke-static {v8, v9}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;Z)[B

    move-result-object v9

    if-eqz v9, :cond_5

    const-string v9, "GooglePlayServicesUtil"

    const-string v10, "Test-keys aren\'t accepted on this build."

    invoke-static {v9, v10}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_4

    .line 0
    :catch_3
    move-exception v0

    const-string v0, "GooglePlayServicesUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not get info for calling package: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto/16 :goto_3

    :cond_b
    move v0, v1

    .line 2000
    goto :goto_6

    .line 0
    :cond_c
    invoke-static {p0}, Lcom/google/android/gms/internal/e;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Lcom/google/android/gms/common/f;->a:[[B

    invoke-static {v5, v0}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;[[B)[B

    move-result-object v0

    if-nez v0, :cond_f

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play services signature invalid."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto/16 :goto_3

    :cond_d
    :try_start_4
    const-string v0, "com.android.vending"

    const/16 v7, 0x40

    invoke-virtual {v6, v0, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v0

    sget-object v7, Lcom/google/android/gms/common/f;->a:[[B

    invoke-static {v0, v7}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;[[B)[B

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play Store signature invalid."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto/16 :goto_3

    :catch_4
    move-exception v0

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play Store is missing."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto/16 :goto_3

    :cond_e
    new-array v7, v2, [[B

    aput-object v0, v7, v1

    invoke-static {v5, v7}, Lcom/google/android/gms/common/c;->a(Landroid/content/pm/PackageInfo;[[B)[B

    move-result-object v0

    if-nez v0, :cond_f

    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Google Play services signature invalid."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    goto/16 :goto_3

    :cond_f
    const v0, 0x648278

    invoke-static {v0}, Lcom/google/android/gms/internal/e;->a(I)I

    move-result v0

    iget v3, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Lcom/google/android/gms/internal/e;->a(I)I

    move-result v3

    if-ge v3, v0, :cond_10

    const-string v0, "GooglePlayServicesUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Google Play services out of date.  Requires 6587000 but found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v4

    goto/16 :goto_3

    :cond_10
    :try_start_5
    const-string v0, "com.google.android.gms"

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    move-result-object v0

    iget-boolean v0, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-nez v0, :cond_11

    const/4 v2, 0x3

    goto/16 :goto_3

    :catch_5
    move-exception v0

    const-string v1, "GooglePlayServicesUtil"

    const-string v3, "Google Play services missing when getting application info."

    invoke-static {v1, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto/16 :goto_3

    :cond_11
    move v2, v1

    goto/16 :goto_3
.end method
