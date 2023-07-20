.class final Lcom/saterskog/cell_lab/g$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/g;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/g;)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lcom/saterskog/cell_lab/g$6;->a:Lcom/saterskog/cell_lab/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 275
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 276
    return-void
.end method
