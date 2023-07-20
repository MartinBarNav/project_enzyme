.class final Lcom/saterskog/cell_lab/s$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/s;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/s;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/s;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 39
    iget-object v0, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/s;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/s;->a(Landroid/content/Context;)V

    .line 41
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/s;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/s;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    const/4 v1, 0x0

    sput-object v1, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    .line 43
    iget-object v1, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/s;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 44
    iget-object v1, p0, Lcom/saterskog/cell_lab/s$1;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/s;->startActivity(Landroid/content/Intent;)V

    .line 47
    const/4 v0, 0x1

    return v0
.end method
