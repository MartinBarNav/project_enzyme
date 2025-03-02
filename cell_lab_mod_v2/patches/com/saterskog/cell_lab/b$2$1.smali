.class final Lcom/saterskog/cell_lab/b$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/b$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic c:Lcom/saterskog/cell_lab/b$2;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/b$2;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iput-object p2, p0, Lcom/saterskog/cell_lab/b$2$1;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/saterskog/cell_lab/b$2$1;->b:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dont_show_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iget-object v2, v2, Lcom/saterskog/cell_lab/b$2;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 120
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/b$2;->e:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/b$2;->e:Landroid/content/DialogInterface$OnClickListener;

    invoke-interface {v0, p1, p2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 123
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/b$2;->f:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/b$2$1;->c:Lcom/saterskog/cell_lab/b$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/b$2;->f:Landroid/content/DialogInterface$OnClickListener;

    invoke-interface {v0, p1, p2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 124
    :cond_2
    return-void
.end method
