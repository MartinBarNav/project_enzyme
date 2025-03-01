.class Landroid/support/v4/view/u$f;
.super Landroid/support/v4/view/u$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# static fields
.field static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 900
    const/4 v0, 0x0

    sput-boolean v0, Landroid/support/v4/view/u$f;->b:Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 898
    invoke-direct {p0}, Landroid/support/v4/view/u$e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/support/v4/view/a;)V
    .locals 1

    .prologue
    .line 923
    .line 1318
    iget-object v0, p2, Landroid/support/v4/view/a;->a:Ljava/lang/Object;

    .line 923
    invoke-static {p1, v0}, Landroid/support/v4/view/y;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 924
    return-void
.end method

.method public final a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 903
    invoke-static {p1, p2}, Landroid/support/v4/view/y;->a(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public final j(Landroid/view/View;)Landroid/support/v4/view/ae;
    .locals 2

    .prologue
    .line 951
    iget-object v0, p0, Landroid/support/v4/view/u$f;->a:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    .line 952
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/u$f;->a:Ljava/util/WeakHashMap;

    .line 955
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/u$f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ae;

    .line 956
    if-nez v0, :cond_1

    .line 957
    new-instance v0, Landroid/support/v4/view/ae;

    invoke-direct {v0, p1}, Landroid/support/v4/view/ae;-><init>(Landroid/view/View;)V

    .line 958
    iget-object v1, p0, Landroid/support/v4/view/u$f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    :cond_1
    return-object v0
.end method
