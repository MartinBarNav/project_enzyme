.class public final Landroid/support/v4/app/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/support/v4/e/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/support/v4/app/j$a;

.field public d:Landroid/view/View;

.field final synthetic e:Landroid/support/v4/app/c;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/c;)V
    .locals 1

    .prologue
    .line 1452
    iput-object p1, p0, Landroid/support/v4/app/c$b;->e:Landroid/support/v4/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1453
    new-instance v0, Landroid/support/v4/e/a;

    invoke-direct {v0}, Landroid/support/v4/e/a;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    .line 1454
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/c$b;->b:Ljava/util/ArrayList;

    .line 1456
    new-instance v0, Landroid/support/v4/app/j$a;

    invoke-direct {v0}, Landroid/support/v4/app/j$a;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/c$b;->c:Landroid/support/v4/app/j$a;

    return-void
.end method
