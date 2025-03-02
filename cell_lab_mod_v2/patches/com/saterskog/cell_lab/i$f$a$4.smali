.class final Lcom/saterskog/cell_lab/i$f$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$f$a;-><init>(Lcom/saterskog/cell_lab/i$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i$f;

.field final synthetic b:Lcom/saterskog/cell_lab/i$f$a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V
    .locals 0

    .prologue
    .line 494
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$a$4;->b:Lcom/saterskog/cell_lab/i$f$a;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$f$a$4;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 497
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 498
    return-void
.end method
