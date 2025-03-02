.class final Lcom/saterskog/cell_lab/m$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:I

.field final synthetic j:I

.field final synthetic k:D

.field final synthetic l:D

.field final synthetic m:I

.field final synthetic n:I

.field final synthetic o:I

.field final synthetic p:D

.field final synthetic q:D

.field final synthetic r:[I

.field final synthetic s:Lcom/saterskog/cell_lab/m;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/m;ZZIIIIIIIIDDIIIDD[I)V
    .locals 2

    .prologue
    .line 156
    iput-object p1, p0, Lcom/saterskog/cell_lab/m$3;->s:Lcom/saterskog/cell_lab/m;

    iput-boolean p2, p0, Lcom/saterskog/cell_lab/m$3;->a:Z

    iput-boolean p3, p0, Lcom/saterskog/cell_lab/m$3;->b:Z

    iput p4, p0, Lcom/saterskog/cell_lab/m$3;->c:I

    iput p5, p0, Lcom/saterskog/cell_lab/m$3;->d:I

    iput p6, p0, Lcom/saterskog/cell_lab/m$3;->e:I

    iput p7, p0, Lcom/saterskog/cell_lab/m$3;->f:I

    iput p8, p0, Lcom/saterskog/cell_lab/m$3;->g:I

    iput p9, p0, Lcom/saterskog/cell_lab/m$3;->h:I

    iput p10, p0, Lcom/saterskog/cell_lab/m$3;->i:I

    iput p11, p0, Lcom/saterskog/cell_lab/m$3;->j:I

    iput-wide p12, p0, Lcom/saterskog/cell_lab/m$3;->k:D

    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/saterskog/cell_lab/m$3;->l:D

    move/from16 v0, p16

    iput v0, p0, Lcom/saterskog/cell_lab/m$3;->m:I

    move/from16 v0, p17

    iput v0, p0, Lcom/saterskog/cell_lab/m$3;->n:I

    move/from16 v0, p18

    iput v0, p0, Lcom/saterskog/cell_lab/m$3;->o:I

    move-wide/from16 v0, p19

    iput-wide v0, p0, Lcom/saterskog/cell_lab/m$3;->p:D

    move-wide/from16 v0, p21

    iput-wide v0, p0, Lcom/saterskog/cell_lab/m$3;->q:D

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/saterskog/cell_lab/m$3;->r:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .prologue
    .line 159
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/m$3;->s:Lcom/saterskog/cell_lab/m;

    invoke-static {v2}, Lcom/saterskog/cell_lab/m;->a(Lcom/saterskog/cell_lab/m;)Landroid/widget/TextView;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/m$3;->s:Lcom/saterskog/cell_lab/m;

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/m$3;->a:Z

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/m$3;->b:Z

    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/m$3;->c:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/m$3;->d:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/m$3;->e:I

    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/m$3;->f:I

    move-object/from16 v0, p0

    iget v9, v0, Lcom/saterskog/cell_lab/m$3;->g:I

    move-object/from16 v0, p0

    iget v10, v0, Lcom/saterskog/cell_lab/m$3;->h:I

    move-object/from16 v0, p0

    iget v11, v0, Lcom/saterskog/cell_lab/m$3;->i:I

    move-object/from16 v0, p0

    iget v12, v0, Lcom/saterskog/cell_lab/m$3;->j:I

    move-object/from16 v0, p0

    iget-wide v13, v0, Lcom/saterskog/cell_lab/m$3;->l:D

    move-object/from16 v0, p0

    iget v15, v0, Lcom/saterskog/cell_lab/m$3;->m:I

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/m$3;->n:I

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/m$3;->o:I

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/m$3;->p:D

    move-wide/from16 v18, v0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/m$3;->q:D

    move-wide/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/m$3;->r:[I

    move-object/from16 v22, v0

    invoke-static/range {v2 .. v22}, Lcom/saterskog/cell_lab/m;->a(Lcom/saterskog/cell_lab/m;ZZIIIIIIIIDIIIDD[I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    return-void
.end method
