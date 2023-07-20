.class public final Lcom/saterskog/cell_lab/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/t$a;
    }
.end annotation


# static fields
.field private static a:I

.field private static b:I

.field private static c:[I

.field private static d:[I

.field private static e:[Ljava/lang/CharSequence;

.field private static f:[Ljava/lang/CharSequence;

.field private static g:Lcom/saterskog/cell_lab/t$a;

.field private static h:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 17
    const/4 v0, -0x1

    sput v0, Lcom/saterskog/cell_lab/t;->a:I

    .line 19
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/saterskog/cell_lab/t;->c:[I

    .line 20
    new-array v0, v1, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/saterskog/cell_lab/t;->d:[I

    return-void

    .line 19
    nop

    :array_0
    .array-data 4
        0x7f020011
        0x7f020012
        0x7f020013
        0x7f020014
    .end array-data

    .line 20
    :array_1
    .array-data 4
        0x7f02000d
        0x7f02000e
        0x7f02000f
        0x7f020010
    .end array-data
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, -0x1

    sput v0, Lcom/saterskog/cell_lab/t;->a:I

    .line 33
    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 47
    sget v0, Lcom/saterskog/cell_lab/t;->a:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    sget-object v0, Lcom/saterskog/cell_lab/t;->e:[Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/saterskog/cell_lab/t;->f:[Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 50
    :cond_1
    sget-object v0, Lcom/saterskog/cell_lab/t;->e:[Ljava/lang/CharSequence;

    sget v2, Lcom/saterskog/cell_lab/t;->b:I

    aget-object v2, v0, v2

    .line 51
    sget-object v0, Lcom/saterskog/cell_lab/t;->f:[Ljava/lang/CharSequence;

    sget v3, Lcom/saterskog/cell_lab/t;->b:I

    aget-object v3, v0, v3

    .line 53
    sget v0, Lcom/saterskog/cell_lab/t;->b:I

    sget-object v4, Lcom/saterskog/cell_lab/t;->e:[Ljava/lang/CharSequence;

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    if-ne v0, v4, :cond_3

    .line 55
    sget-object v0, Lcom/saterskog/cell_lab/t;->h:Lcom/saterskog/cell_lab/PlayActivity;

    iget v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {v0, p0}, Lcom/saterskog/cell_lab/j;->b(ILandroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    .line 56
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    sget v0, Lcom/saterskog/cell_lab/t;->a:I

    invoke-static {v0, p0}, Lcom/saterskog/cell_lab/j;->c(ILandroid/content/Context;)V

    .line 58
    sget-object v0, Lcom/saterskog/cell_lab/t;->h:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/PlayActivity;->h()V

    .line 60
    :cond_2
    sget-object v0, Lcom/saterskog/cell_lab/t;->h:Lcom/saterskog/cell_lab/PlayActivity;

    .line 2767
    iput-boolean v1, v0, Lcom/saterskog/cell_lab/PlayActivity;->E:Z

    .line 63
    :cond_3
    new-instance v0, Lcom/saterskog/cell_lab/t$1;

    invoke-direct {v0, p0, v2, v3}, Lcom/saterskog/cell_lab/t$1;-><init>(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 55
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static a(Landroid/app/Activity;II)V
    .locals 7

    .prologue
    .line 71
    if-eqz p0, :cond_1

    sget v0, Lcom/saterskog/cell_lab/t;->a:I

    if-ne v0, p1, :cond_1

    sget v0, Lcom/saterskog/cell_lab/t;->b:I

    if-ne v0, p2, :cond_1

    .line 73
    sget-object v0, Lcom/saterskog/cell_lab/t;->g:Lcom/saterskog/cell_lab/t$a;

    if-eqz v0, :cond_0

    .line 74
    sget-object v0, Lcom/saterskog/cell_lab/t;->g:Lcom/saterskog/cell_lab/t$a;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/t$a;->d()V

    .line 75
    :cond_0
    sget v0, Lcom/saterskog/cell_lab/t;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/saterskog/cell_lab/t;->b:I

    .line 76
    invoke-static {p0}, Lcom/saterskog/b/a;->b(Landroid/content/Context;)J

    move-result-wide v4

    .line 77
    const-string v1, "tutCheckPoint:installTime"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-static {v4, v5}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v3

    move-object v6, p0

    .line 77
    invoke-static/range {v1 .. v6}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 82
    invoke-static {p0}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;)V

    .line 84
    :cond_1
    return-void
.end method

.method public static a(Landroid/app/Activity;III)V
    .locals 4

    .prologue
    .line 94
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/saterskog/cell_lab/t$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/saterskog/cell_lab/t$2;-><init>(Landroid/app/Activity;II)V

    int-to-long v2, p3

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 101
    return-void
.end method

.method static synthetic a(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 4

    .prologue
    .line 3103
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 3105
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 3106
    const v2, 0x7f0a0025

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 3107
    const v0, 0x7f0800e9

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3108
    const v0, 0x7f0800d5

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3114
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 3117
    const v0, 0x7f0e005d

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/t$3;

    invoke-direct {v2}, Lcom/saterskog/cell_lab/t$3;-><init>()V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 3123
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 16
    return-void
.end method

.method public static a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 132
    const-string v0, "TMtut"

    sget v1, Lcom/saterskog/cell_lab/t;->a:I

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 133
    const-string v0, "TMpop"

    sget v1, Lcom/saterskog/cell_lab/t;->b:I

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 134
    return-void
.end method

.method public static a(Lcom/saterskog/cell_lab/PlayActivity;ILcom/saterskog/cell_lab/t$a;)V
    .locals 3

    .prologue
    .line 36
    sput-object p0, Lcom/saterskog/cell_lab/t;->h:Lcom/saterskog/cell_lab/PlayActivity;

    .line 37
    sput-object p2, Lcom/saterskog/cell_lab/t;->g:Lcom/saterskog/cell_lab/t$a;

    .line 38
    sput p1, Lcom/saterskog/cell_lab/t;->a:I

    .line 39
    const/4 v0, 0x0

    sput v0, Lcom/saterskog/cell_lab/t;->b:I

    .line 40
    sget v0, Lcom/saterskog/cell_lab/t;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 41
    if-nez p0, :cond_0

    const-string v0, "nulll context passed to TutorialManager.init"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 42
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lcom/saterskog/cell_lab/t;->c:[I

    sget v2, Lcom/saterskog/cell_lab/t;->a:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v0

    sput-object v0, Lcom/saterskog/cell_lab/t;->e:[Ljava/lang/CharSequence;

    .line 43
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lcom/saterskog/cell_lab/t;->d:[I

    sget v2, Lcom/saterskog/cell_lab/t;->a:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v0

    sput-object v0, Lcom/saterskog/cell_lab/t;->f:[Ljava/lang/CharSequence;

    .line 45
    :cond_1
    return-void
.end method

.method public static a(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/t$a;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 126
    sput-object p0, Lcom/saterskog/cell_lab/t;->h:Lcom/saterskog/cell_lab/PlayActivity;

    .line 127
    sput-object p1, Lcom/saterskog/cell_lab/t;->g:Lcom/saterskog/cell_lab/t$a;

    .line 128
    const-string v0, "TMtut"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/saterskog/cell_lab/t;->a:I

    .line 129
    const-string v0, "TMpop"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/saterskog/cell_lab/t;->b:I

    .line 130
    return-void
.end method

.method public static b(Landroid/app/Activity;II)V
    .locals 1

    .prologue
    .line 87
    const/16 v0, 0x1f4

    invoke-static {p0, p1, p2, v0}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 88
    return-void
.end method
