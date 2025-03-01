.class final Lcom/saterskog/cell_lab/t$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/CharSequence;

.field final synthetic c:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/saterskog/cell_lab/t$1;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/t$1;->b:Ljava/lang/CharSequence;

    iput-object p3, p0, Lcom/saterskog/cell_lab/t$1;->c:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/saterskog/cell_lab/t$1;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/t$1;->b:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/saterskog/cell_lab/t$1;->c:Ljava/lang/CharSequence;

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 67
    return-void
.end method
