.class final Lcom/saterskog/cell_lab/GenomePreviewView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/GenomePreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/saterskog/cell_lab/Gene;

.field final synthetic b:I

.field final synthetic c:D

.field final synthetic d:Lcom/saterskog/cell_lab/GenomePreviewView;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/GenomePreviewView;[Lcom/saterskog/cell_lab/Gene;ID)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->d:Lcom/saterskog/cell_lab/GenomePreviewView;

    iput-object p2, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->a:[Lcom/saterskog/cell_lab/Gene;

    iput p3, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->b:I

    iput-wide p4, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 98
    iget-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->d:Lcom/saterskog/cell_lab/GenomePreviewView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    iget-object v1, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->b:I

    iget-wide v4, p0, Lcom/saterskog/cell_lab/GenomePreviewView$1;->c:D

    .line 1065
    iput-wide v4, v0, Lcom/saterskog/cell_lab/n;->u:D

    .line 1066
    iput v2, v0, Lcom/saterskog/cell_lab/n;->w:I

    .line 1067
    iput-object v1, v0, Lcom/saterskog/cell_lab/n;->v:[Lcom/saterskog/cell_lab/Gene;

    .line 1068
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/n;->t:Z

    .line 99
    return-void
.end method
