.class public Lcom/saterskog/cell_lab/CellLabApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lcom/saterskog/b/a$a;


# instance fields
.field a:Lcom/google/android/gms/b/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellLabApplication;->a:Lcom/google/android/gms/b/g;

    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/CellLabApplication;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellLabApplication;->a()Lcom/google/android/gms/b/g;

    .line 29
    const v0, 0x7f110001

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/preference/PreferenceManager;->setDefaultValues(Landroid/content/Context;IZ)V

    .line 31
    invoke-static {p0}, Lcom/saterskog/cell_lab/s;->a(Landroid/content/Context;)V

    .line 32
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/google/android/gms/b/g;
    .locals 1

    .prologue
    .line 16
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellLabApplication;->a:Lcom/google/android/gms/b/g;

    if-nez v0, :cond_0

    .line 18
    invoke-static {p0}, Lcom/google/android/gms/b/c;->a(Landroid/content/Context;)Lcom/google/android/gms/b/c;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/b/c;->b()Lcom/google/android/gms/b/g;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellLabApplication;->a:Lcom/google/android/gms/b/g;

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellLabApplication;->a:Lcom/google/android/gms/b/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
