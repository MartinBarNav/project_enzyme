.class final Lcom/saterskog/cell_lab/i$d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$d;-><init>(Lcom/saterskog/cell_lab/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i;

.field final synthetic b:Lcom/saterskog/cell_lab/i$d;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$d;Lcom/saterskog/cell_lab/i;)V
    .locals 0

    .prologue
    .line 748
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$d$2;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 12

    .prologue
    .line 751
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    .line 1857
    const/high16 v1, 0x3e800000    # 0.25f

    const/high16 v2, 0x41100000    # 9.0f

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->d:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v2

    const/high16 v2, 0x42400000    # 48.0f

    div-float/2addr v0, v2

    add-float v7, v1, v0

    .line 752
    const/4 v0, 0x0

    .line 753
    const/4 v1, -0x1

    .line 754
    const/4 v2, 0x0

    move v6, v2

    :goto_0
    const/4 v2, 0x4

    if-ge v6, v2, :cond_3

    .line 755
    const/4 v0, 0x0

    move v11, v1

    move v1, v0

    move v0, v11

    :goto_1
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 757
    if-eq v6, v1, :cond_0

    .line 758
    add-int/lit8 v0, v0, 0x1

    .line 759
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->b:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    if-eq v0, v2, :cond_1

    .line 755
    :cond_0
    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    goto :goto_1

    .line 761
    :cond_1
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->b:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    if-eq v0, v2, :cond_2

    .line 754
    add-int/lit8 v2, v6, 0x1

    int-to-short v2, v2

    move v6, v2

    move v11, v1

    move v1, v0

    move v0, v11

    goto :goto_0

    :cond_2
    move v0, v1

    .line 765
    :cond_3
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->a:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v8

    .line 768
    const/high16 v1, 0x40f00000    # 7.5f

    int-to-float v2, v8

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v3

    add-float v9, v1, v2

    .line 769
    const/4 v4, 0x0

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x7

    aget v1, v1, v2

    const/high16 v2, 0x41000000    # 8.0f

    mul-float v3, v1, v2

    .line 771
    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    add-float/2addr v2, v3

    mul-float/2addr v2, v1

    .line 772
    const/4 v1, 0x0

    move v11, v1

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v11

    :goto_2
    const/16 v5, 0x19

    if-ge v4, v5, :cond_5

    .line 773
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    invoke-virtual {v5, v8, v9, v1}, Lcom/saterskog/cell_lab/i$d;->a(IFF)F

    move-result v5

    .line 776
    sub-float/2addr v5, v7

    const/4 v10, 0x0

    cmpg-float v5, v5, v10

    if-gez v5, :cond_4

    move v2, v3

    .line 780
    :goto_3
    const/high16 v3, 0x3f000000    # 0.5f

    add-float v5, v2, v1

    mul-float/2addr v5, v3

    .line 772
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v5

    goto :goto_2

    :cond_4
    move v11, v2

    move v2, v1

    move v1, v11

    .line 779
    goto :goto_3

    .line 787
    :cond_5
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v3, 0x5

    aput v6, v2, v3

    .line 788
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    const/4 v3, 0x1

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 789
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    iput-short v0, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 790
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v4, 0x7

    aget v3, v3, v4

    div-float v3, v1, v3

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 791
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    const/4 v3, 0x0

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 793
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v3, 0x6

    aput v0, v2, v3

    .line 794
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    const/4 v3, 0x1

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 795
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    iput-short v6, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 796
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    neg-float v1, v1

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v4, 0x7

    aget v3, v3, v4

    div-float/2addr v1, v3

    iput v1, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 797
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    const/4 v2, 0x0

    iput v2, v1, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 799
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v2, 0x7

    aput v6, v1, v2

    .line 800
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    const/4 v2, 0x1

    iput-short v2, v1, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 801
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    iput-short v6, v1, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 802
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v3, 0x7

    aget v2, v2, v3

    div-float v2, v9, v2

    iput v2, v1, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 803
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    const/4 v2, 0x0

    iput v2, v1, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 805
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v2, 0x8

    aput v0, v1, v2

    .line 806
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const/4 v2, 0x1

    iput-short v2, v1, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 807
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    iput-short v0, v1, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 808
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x7

    aget v1, v1, v2

    div-float v1, v9, v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 809
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    const/4 v1, 0x0

    iput v1, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 810
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 811
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 812
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d$2;->b:Lcom/saterskog/cell_lab/i$d;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 813
    return-void
.end method
