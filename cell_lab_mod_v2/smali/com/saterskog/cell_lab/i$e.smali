.class abstract Lcom/saterskog/cell_lab/i$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "e"
.end annotation


# instance fields
.field e:Landroid/widget/TextView;

.field f:Landroid/widget/RelativeLayout;

.field g:Lcom/saterskog/cell_lab/h;

.field protected h:I

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:I

.field protected l:Ljava/lang/String;

.field final synthetic m:Lcom/saterskog/cell_lab/i;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;I)V
    .locals 1

    .prologue
    .line 89
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$e;->m:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$e;->e:Landroid/widget/TextView;

    .line 90
    iput-object p5, p0, Lcom/saterskog/cell_lab/i$e;->g:Lcom/saterskog/cell_lab/h;

    .line 91
    iput p4, p0, Lcom/saterskog/cell_lab/i$e;->h:I

    .line 92
    iput-object p2, p0, Lcom/saterskog/cell_lab/i$e;->i:Ljava/lang/String;

    .line 93
    iput-object p3, p0, Lcom/saterskog/cell_lab/i$e;->j:Ljava/lang/String;

    .line 94
    iput p6, p0, Lcom/saterskog/cell_lab/i$e;->k:I

    .line 96
    return-void
.end method


# virtual methods
.method abstract a()Landroid/view/View;
.end method

.method abstract b()V
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$e;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$e;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
