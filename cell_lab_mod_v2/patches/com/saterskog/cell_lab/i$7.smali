.class final Lcom/saterskog/cell_lab/i$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lcom/saterskog/cell_lab/i;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 2092
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$7;->b:Lcom/saterskog/cell_lab/i;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$7;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 2095
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$7;->b:Lcom/saterskog/cell_lab/i;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$7;->a:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    .line 2096
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$7;->b:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2107
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$7;->b:Lcom/saterskog/cell_lab/i;

    invoke-static {v1, v0}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;Ljava/lang/String;)V

    .line 2108
    return-void
.end method
