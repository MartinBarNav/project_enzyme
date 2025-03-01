.class final Lcom/saterskog/cell_lab/PlayActivity$16$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity$16;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity$16;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity$16;)V
    .locals 0

    .prologue
    .line 1602
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$16$1;->a:Lcom/saterskog/cell_lab/PlayActivity$16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1605
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16$1;->a:Lcom/saterskog/cell_lab/PlayActivity$16;

    iget-object v0, v0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->g(Lcom/saterskog/cell_lab/PlayActivity;)V

    .line 1606
    return-void
.end method
