.class final Lcom/saterskog/cell_lab/t$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroid/app/Activity;II)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/saterskog/cell_lab/t$2;->a:Landroid/app/Activity;

    iput p2, p0, Lcom/saterskog/cell_lab/t$2;->b:I

    iput p3, p0, Lcom/saterskog/cell_lab/t$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/saterskog/cell_lab/t$2;->a:Landroid/app/Activity;

    iget v1, p0, Lcom/saterskog/cell_lab/t$2;->b:I

    iget v2, p0, Lcom/saterskog/cell_lab/t$2;->c:I

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;II)V

    .line 98
    return-void
.end method
