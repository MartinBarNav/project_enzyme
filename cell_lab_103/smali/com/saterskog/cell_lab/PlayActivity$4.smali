.class final Lcom/saterskog/cell_lab/PlayActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 1088
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$4;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 1091
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 1092
    return-void
.end method
