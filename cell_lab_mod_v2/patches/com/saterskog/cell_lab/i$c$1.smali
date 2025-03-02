.class final Lcom/saterskog/cell_lab/i$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$c;->a()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i$c;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$c;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$c$1;->a:Lcom/saterskog/cell_lab/i$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 146
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c$1;->a:Lcom/saterskog/cell_lab/i$c;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c$1;->a:Lcom/saterskog/cell_lab/i$c;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c$1;->a:Lcom/saterskog/cell_lab/i$c;

    iget v1, v1, Lcom/saterskog/cell_lab/i$c;->h:I

    aput p3, v0, v1

    .line 147
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c$1;->a:Lcom/saterskog/cell_lab/i$c;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 148
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 153
    return-void
.end method
