.class final Lcom/saterskog/cell_lab/s$3;
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
    .line 66
    iput-object p1, p0, Lcom/saterskog/cell_lab/s$3;->a:Lcom/saterskog/cell_lab/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/saterskog/cell_lab/s$3;->a:Lcom/saterskog/cell_lab/s;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/s;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/s$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/s$a;->b(Z)V

    .line 74
    const/4 v0, 0x1

    return v0
.end method
